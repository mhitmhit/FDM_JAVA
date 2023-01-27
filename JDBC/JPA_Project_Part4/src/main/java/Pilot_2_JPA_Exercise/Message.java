package Pilot_2_JPA_Exercise;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int messageId;
	@Column
	private String messageContent;
	
	@ManyToOne
	@JoinColumn(name="sender")
	private User sender;
	
	@ManyToOne
	@JoinColumn(name="recipient")
	private User recipient;
	
	public Message(String messageContent, User sender, User recipient) {
		super();
		//this.messageId = messageId;
		this.messageContent = messageContent;
		this.sender = sender;
		this.recipient = recipient;
	}

	public Message() {
		super();
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getRecipient() {
		return recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}
	
	
	
}
