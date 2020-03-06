package jdbc.jdbc03.work02.util;

import java.util.List;

/**
 * @author shkstart
 * @date 8/17/2019 - 8:19 PM
 */
public class PageUtil<E> {
    private int totalRecord;//总记录数
    private final int pageSize = 3;//每页记录数
    private int totalPages;//总页数
    private int currentPage;//待搜索页码
    private int startRecord;//查询起始页数
    private List<E> modelList;//当前页的记录对象集合
    public PageUtil(int currentPage){
        this.currentPage = currentPage;
        this.startRecord = (currentPage-1)*pageSize;
    }
    public PageUtil(){
        this(1);
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getStartRecord() {
        return startRecord;
    }

    public void setStartRecord(int startRecord) {
        this.startRecord = startRecord;
    }

    public List<E> getModelList() {
        return modelList;
    }

    public void setModelList(List<E> modelList) {
        this.modelList = modelList;
    }

    @Override
    public String toString() {
        return "PageUtil{" +
                "totalRecord=" + totalRecord +
                ", pageSize=" + pageSize +
                ", totalPages=" + totalPages +
                ", currentPage=" + currentPage +
                ", startRecord=" + startRecord +
                ", modelList=" + modelList +
                '}';
    }
}
