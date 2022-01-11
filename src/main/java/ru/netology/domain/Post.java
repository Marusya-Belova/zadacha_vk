package ru.netology.domain;


public class Post {
    private int id;
    private int ownerId;
    private CommentsInfo commentsInfo;
    private ViewsPost viewsPost;
    private LikesPost likesPost;
    private int authorID;
    private RepostPost reportsPost;
    private String datePost;
    private String textPost;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String postType;
    private Geo geo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;


    // + get/set на все поля
}