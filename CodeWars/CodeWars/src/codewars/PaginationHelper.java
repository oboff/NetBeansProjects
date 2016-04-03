/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.List;

/*
For this exercise you will be strengthening your page-fu mastery. You will complete the PaginationHelper class, which is a utility class helpful for querying paging information related to an array.

The class is designed to take in an array of values and an integer indicating how many items will be allowed per each page. The types of values contained within the collection/array are not relevant.

The following are some examples of how this class is used:

PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
helper.pageCount(); //should == 2
helper.itemCount(); //should == 6
helper.pageItemCount(0); //should == 4
helper.pageItemCount(1); // last page - should == 2
helper.pageItemCount(2); // should == -1 since the page is invalid

// pageIndex takes an item index and returns the page that it belongs on
helper.pageIndex(5); //should == 1 (zero based index)
helper.pageIndex(2); //should == 0
helper.pageIndex(20); //should == -1
helper.pageIndex(-10); //should == -1
 */
// TODO: complete this object/class
public class PaginationHelper<I> {

    private int itemcount;
    private int pagecount;
    private int itemsperpage;

    /**
     * The constructor takes in an array of items and a integer indicating how
     * many items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.itemcount = collection.size();
        this.pagecount = (int) Math.ceil((double) itemcount / itemsPerPage);
        this.itemsperpage = itemsPerPage;

    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return itemcount;
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return pagecount;
    }

    /**
     * returns the number of items on the current page. page_index is zero
     * based. this method should return -1 for pageIndex values that are out of
     * range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex > pagecount) {
            return -1;
        }
        int remaining = (itemcount - (pagecount * (pageIndex - 1)));
        return remaining >= pagecount
                ? pagecount
                : remaining % pagecount;
    }

    /**
     * determines what page an item is on. Zero based indexes this method should
     * return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        return itemIndex > itemcount ? -1 : (int) (Math.ceil((double) itemIndex / this.itemsperpage));
    }
}
