package org.acm.nitsurat.digitalcanteen;

/**
 * Created by JV on 14-03-2016.
 */
public class BillRow {
    public String itemlist, quantitylist, totallist;
    public BillRow(){
        super();
    }

    public BillRow(String itemlist,String quantitylist,String totallist) {
        super();
        this.itemlist = itemlist;
        this.quantitylist = quantitylist;
        this.totallist = totallist;
    }
}
