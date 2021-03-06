package com.d.music.module.greendao.music;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table "CUSTOM_LIST".
 */
public class CustomList {

    public Long id;
    public String listName;
    public Long songCount;
    public Integer seq;
    public Integer sortBy;
    public Integer pointer;//=type

    public boolean isChecked = false;//额外属性，是否选中
    public boolean isOpen = false;

    public CustomList() {
    }

    public CustomList(Long id) {
        this.id = id;
    }

    public CustomList(Long id, String listName, Long songCount, Integer seq, Integer sortBy, Integer pointer) {
        this.id = id;
        this.listName = listName;
        this.songCount = songCount;
        this.seq = seq;
        this.sortBy = sortBy;
        this.pointer = pointer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Long getSongCount() {
        return songCount;
    }

    public void setSongCount(Long songCount) {
        this.songCount = songCount;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getSortBy() {
        return sortBy;
    }

    public void setSortBy(Integer sortBy) {
        this.sortBy = sortBy;
    }

    public Integer getPointer() {
        return pointer;
    }

    public void setPointer(Integer pointer) {
        this.pointer = pointer;
    }

}
