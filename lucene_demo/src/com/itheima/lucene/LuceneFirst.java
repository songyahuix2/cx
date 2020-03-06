package com.itheima.lucene;

import org.apache.commons.io.FileUtils;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.*;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;
import java.io.File;
import java.io.IOException;

/**
 * @author shkstart
 * @date 2019/10/3 - 12:11
 */
public class LuceneFirst {
    @Test
    public void createIndex() throws Exception {

//        1. 创建一个Director对象，指定索引库保存位置
        Directory directory = FSDirectory.open(new File("F:\\01_Program\\java\\indexlib").toPath());
//        2. 基于Directory对象创建一个IndexWriter对象
        IndexWriter indexWriter = new IndexWriter(directory, new IndexWriterConfig());
        indexWriter.commit();
//        3. 读取磁盘文件，对应每个文件创建一个文档对象
        File dir = new File("F:\\01_Program\\java\\initial_dir");
        File[] files = dir.listFiles();
        for (File f : files) {
//          取文件名
            String fileName = f.getName();
//          文件路径
            String filePath = f.getPath();
//          文件内容
            String fileContent = FileUtils.readFileToString(f, "utf-8");
//            文件大小
            long fileSize = FileUtils.sizeOf(f);
//            创建Field
//            参数：域名，域的内容，是否存储
            Field fieldName = new TextField("name", fileName, Field.Store.YES);
            Field fieldPath = new TextField("path", filePath, Field.Store.YES);
            Field fieldContent = new TextField("content", fileContent, Field.Store.YES);
            Field fieldSize = new TextField("size", fileSize + "", Field.Store.YES);
//             创建文档对象
            Document document = new Document();
//        4. 向文档对象中添加域
            document.add(fieldName);
            document.add(fieldPath);
            document.add(fieldContent);
            document.add(fieldSize);
//        5. 把文档对象写入索引库
            indexWriter.addDocument(document);
        }
//        6. 关闭indexwriter对象
        indexWriter.close();
        }
    @Test
    public void searchIndex() throws Exception{
//        1. 创建一个Director对象，指定索引库的位置
        Directory directory = FSDirectory.open(new File("F:\\01_Program\\java\\indexlib").toPath());
//        2. 创建一个IndexReader对象
        IndexReader indexReader = DirectoryReader.open(directory);
//        3. 创建要给IndexSearcher对象，构造方法中的参数:indexReader对象
        IndexSearcher indexSearcher = new IndexSearcher(indexReader);
//        4. 创建一个Query对象，TermQuery
        Query query = new TermQuery(new Term("content","评"));
//        5. 执行查询，得到要给TopDocs对象
//        参数：查询对象、查询结果数量
        TopDocs topDocs =indexSearcher.search(query,10);
//        6. 取查询结果的总记录数
        System.out.println("查询总记录数："+topDocs.totalHits);
//        7. 取文档列表
        ScoreDoc[] scoreDocs = topDocs.scoreDocs;
//        8. 打印文档内容
        for(ScoreDoc doc:scoreDocs){
            int docId = doc.doc;
            Document document = indexSearcher.doc(docId);
            System.out.println(document.get("name"));
            System.out.println(document.get("path"));
            System.out.println(document.get("content"));
            System.out.println(document.get("size"));
            System.out.println("-----------------------------------");
        }
//        9. 关闭indexReader对象
        indexReader.close();
    }
    @Test
    public void tokenStream() throws IOException {
//        1. 创建Analyzer对象，StandardAnalyzer对象
//        Analyzer analyzer = new StandardAnalyzer();
        Analyzer analyzer = new IKAnalyzer();
//        2. 使用分析其对象的tokenStream方法获得一个TokenStream对象
        TokenStream tokenStream = analyzer.tokenStream("","the spring framework provides a  诛仙");
//        3. 向TokenStream对象中设置一个引用，相当于数一个指针
        CharTermAttribute charTermAttribute = tokenStream.addAttribute(CharTermAttribute.class);
//        4. 调用TokenStream对象的rest方法
        tokenStream.reset();
//        5. 使用while循环来遍历TokenStream对象，如果不调用抛异常
        while (tokenStream.incrementToken()){
            System.out.println(charTermAttribute.toString());
        }
//        6. 关闭TokenStream对象
        tokenStream.close();
    }
    @Test
    public void deleteDocumentByQuery()throws Exception{

        //        1. 创建一个Director对象，指定索引库的位置
        Directory directory = FSDirectory.open(new File("C:\\temp\\indexlib").toPath());
        //        2. 基于Directory对象创建一个IndexWriter对象
        IndexWriter indexWriter = new IndexWriter(directory, new IndexWriterConfig());
//        3.删除document,而不是删除本地的原始数据
        indexWriter.deleteDocuments(new Term("content","spring"));
        indexWriter.close();
    }
    @Test
    public void deleteDocuments()throws Exception{
        //        1. 创建一个Director对象，指定索引库的位置
        Directory directory = FSDirectory.open(new File("C:\\temp\\indexlib").toPath());
        //        2. 基于Directory对象创建一个IndexWriter对象
        IndexWriter indexWriter = new IndexWriter(directory, new IndexWriterConfig());
//        3.删除所有document,而不是删除本地的原始数据
        indexWriter.deleteAll();
        indexWriter.close();
    }
    @Test
    public void updateDocument() throws Exception{
        //        1. 创建一个Director对象，指定索引库的位置
        Directory directory = FSDirectory.open(new File("C:\\temp\\indexlib").toPath());
        //        2. 基于Directory对象创建一个IndexWriter对象
        IndexWriter indexWriter = new IndexWriter(directory, new IndexWriterConfig());
        Document document = new Document();
        document.add(new TextField("name","更新之后的文档",Field.Store.YES));
        document.add(new TextField("name1","更新之后的文档1",Field.Store.YES));
        document.add(new TextField("name2","更新之后的文档2",Field.Store.YES));
        document.add(new TextField("name3","更新之后的文档3",Field.Store.YES));
        //更新操作
        indexWriter.updateDocument(new Term("name","spring"),document);
        indexWriter.close();
    }
}
