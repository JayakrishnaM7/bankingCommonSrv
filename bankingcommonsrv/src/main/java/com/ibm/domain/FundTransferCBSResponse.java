package com.ibm.domain;

public class FundTransferCBSResponse extends BaseResponse{
	private String id;

    private String create_timestamp;

    private String done_timestamp;

    private boolean done;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setCreate_timestamp(String create_timestamp){
        this.create_timestamp = create_timestamp;
    }
    public String getCreate_timestamp(){
        return this.create_timestamp;
    }
    public void setDone_timestamp(String done_timestamp){
        this.done_timestamp = done_timestamp;
    }
    public String getDone_timestamp(){
        return this.done_timestamp;
    }
    public void setDone(boolean done){
        this.done = done;
    }
    public boolean getDone(){
        return this.done;
    }

    @Override
    public String toString() {
        return "FundTransferCBSResponse [create_timestamp=" + create_timestamp + ", done=" + done + ", done_timestamp="
                + done_timestamp + ", id=" + id + "]";
    }

}
