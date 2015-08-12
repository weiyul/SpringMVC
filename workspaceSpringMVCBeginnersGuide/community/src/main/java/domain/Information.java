package domain;

public class Information {
	private String id;
	private String title;
	private String Content;
	private String publishingTime;
	private User publishingUser;
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Information(){
		
	}
	public Information(String title, String content,
			String publishingTime, User publishingUser, String type) {
		
		this.title = title;
		Content = content;
		this.publishingTime = publishingTime;
		this.publishingUser = publishingUser;
		this.type=type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getPublishingTime() {
		return publishingTime;
	}
	public void setPublishingTime(String publishingTime) {
		this.publishingTime = publishingTime;
	}
	public User getPublishingUser() {
		return publishingUser;
	}
	public void setPublishingUser(User publishingUser) {
		this.publishingUser = publishingUser;
	}
	@Override
	public String toString() {
		return "Information [id=" + id + ", title=" + title + ", Content="
				+ Content + ", publishingTime=" + publishingTime
				+ ", publishingUser=" + publishingUser + ", type=" + type + "]";
	}
	
}
