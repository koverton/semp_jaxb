//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.27 at 09:48:21 AM EDT 
//


package com.solacesystems.semp_jaxb.r7_2VMR.reply;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for message-spool-stats-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message-spool-stats-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="last-message-id-spooled" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="last-message-id-sent" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="low-message-id-ack-received" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="high-message-id-ack-received" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="messages-redelivered" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="spool-usage-exceeded" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="max-message-size-exceeded" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="spool-shutdown-discard" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="user-profile-deny-guaranteed" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="no-local-delivery-discard" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="destination-group-error" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="low-priority-msg-congestion-discard" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="total-deleted-messages" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="total-ttl-expired-discard-messages" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="total-ttl-expired-to-dmq-messages" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="total-ttl-expired-to-dmq-failures" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="max-redelivery-exceeded-discard-messages" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="max-redelivery-exceeded-to-dmq-messages" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="max-redelivery-exceeded-to-dmq-failures" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="total-ttl-exceeded-discard-messages" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="total-bytes-spooled" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="total-messages-spooled" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="ingress-selector-stats" type="{}selector-stats-type" minOccurs="0"/>
 *         &lt;element name="replication-stats" type="{}replication-endpt-stats" minOccurs="0"/>
 *         &lt;element name="egress-flow-stats" type="{}egress-flow-stats-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bind-stats" type="{}qendpt-bind-stats" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message-spool-stats-type", propOrder = {
    "lastMessageIdSpooled",
    "lastMessageIdSent",
    "lowMessageIdAckReceived",
    "highMessageIdAckReceived",
    "messagesRedelivered",
    "spoolUsageExceeded",
    "maxMessageSizeExceeded",
    "spoolShutdownDiscard",
    "userProfileDenyGuaranteed",
    "noLocalDeliveryDiscard",
    "destinationGroupError",
    "lowPriorityMsgCongestionDiscard",
    "totalDeletedMessages",
    "totalTtlExpiredDiscardMessages",
    "totalTtlExpiredToDmqMessages",
    "totalTtlExpiredToDmqFailures",
    "maxRedeliveryExceededDiscardMessages",
    "maxRedeliveryExceededToDmqMessages",
    "maxRedeliveryExceededToDmqFailures",
    "totalTtlExceededDiscardMessages",
    "totalBytesSpooled",
    "totalMessagesSpooled",
    "ingressSelectorStats",
    "replicationStats",
    "egressFlowStats",
    "bindStats"
})
public class MessageSpoolStatsType {

    @XmlElement(name = "last-message-id-spooled")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lastMessageIdSpooled;
    @XmlElement(name = "last-message-id-sent")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lastMessageIdSent;
    @XmlElement(name = "low-message-id-ack-received")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lowMessageIdAckReceived;
    @XmlElement(name = "high-message-id-ack-received")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger highMessageIdAckReceived;
    @XmlElement(name = "messages-redelivered")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger messagesRedelivered;
    @XmlElement(name = "spool-usage-exceeded")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger spoolUsageExceeded;
    @XmlElement(name = "max-message-size-exceeded")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger maxMessageSizeExceeded;
    @XmlElement(name = "spool-shutdown-discard")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger spoolShutdownDiscard;
    @XmlElement(name = "user-profile-deny-guaranteed")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger userProfileDenyGuaranteed;
    @XmlElement(name = "no-local-delivery-discard")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger noLocalDeliveryDiscard;
    @XmlElement(name = "destination-group-error")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger destinationGroupError;
    @XmlElement(name = "low-priority-msg-congestion-discard")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lowPriorityMsgCongestionDiscard;
    @XmlElement(name = "total-deleted-messages")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalDeletedMessages;
    @XmlElement(name = "total-ttl-expired-discard-messages")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalTtlExpiredDiscardMessages;
    @XmlElement(name = "total-ttl-expired-to-dmq-messages")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalTtlExpiredToDmqMessages;
    @XmlElement(name = "total-ttl-expired-to-dmq-failures")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalTtlExpiredToDmqFailures;
    @XmlElement(name = "max-redelivery-exceeded-discard-messages")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger maxRedeliveryExceededDiscardMessages;
    @XmlElement(name = "max-redelivery-exceeded-to-dmq-messages")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger maxRedeliveryExceededToDmqMessages;
    @XmlElement(name = "max-redelivery-exceeded-to-dmq-failures")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger maxRedeliveryExceededToDmqFailures;
    @XmlElement(name = "total-ttl-exceeded-discard-messages")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalTtlExceededDiscardMessages;
    @XmlElement(name = "total-bytes-spooled")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalBytesSpooled;
    @XmlElement(name = "total-messages-spooled")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalMessagesSpooled;
    @XmlElement(name = "ingress-selector-stats")
    protected SelectorStatsType ingressSelectorStats;
    @XmlElement(name = "replication-stats")
    protected ReplicationEndptStats replicationStats;
    @XmlElement(name = "egress-flow-stats")
    protected List<EgressFlowStatsType> egressFlowStats;
    @XmlElement(name = "bind-stats")
    protected QendptBindStats bindStats;

    /**
     * Gets the value of the lastMessageIdSpooled property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastMessageIdSpooled() {
        return lastMessageIdSpooled;
    }

    /**
     * Sets the value of the lastMessageIdSpooled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastMessageIdSpooled(BigInteger value) {
        this.lastMessageIdSpooled = value;
    }

    /**
     * Gets the value of the lastMessageIdSent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastMessageIdSent() {
        return lastMessageIdSent;
    }

    /**
     * Sets the value of the lastMessageIdSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastMessageIdSent(BigInteger value) {
        this.lastMessageIdSent = value;
    }

    /**
     * Gets the value of the lowMessageIdAckReceived property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowMessageIdAckReceived() {
        return lowMessageIdAckReceived;
    }

    /**
     * Sets the value of the lowMessageIdAckReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowMessageIdAckReceived(BigInteger value) {
        this.lowMessageIdAckReceived = value;
    }

    /**
     * Gets the value of the highMessageIdAckReceived property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHighMessageIdAckReceived() {
        return highMessageIdAckReceived;
    }

    /**
     * Sets the value of the highMessageIdAckReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHighMessageIdAckReceived(BigInteger value) {
        this.highMessageIdAckReceived = value;
    }

    /**
     * Gets the value of the messagesRedelivered property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMessagesRedelivered() {
        return messagesRedelivered;
    }

    /**
     * Sets the value of the messagesRedelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMessagesRedelivered(BigInteger value) {
        this.messagesRedelivered = value;
    }

    /**
     * Gets the value of the spoolUsageExceeded property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpoolUsageExceeded() {
        return spoolUsageExceeded;
    }

    /**
     * Sets the value of the spoolUsageExceeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpoolUsageExceeded(BigInteger value) {
        this.spoolUsageExceeded = value;
    }

    /**
     * Gets the value of the maxMessageSizeExceeded property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxMessageSizeExceeded() {
        return maxMessageSizeExceeded;
    }

    /**
     * Sets the value of the maxMessageSizeExceeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxMessageSizeExceeded(BigInteger value) {
        this.maxMessageSizeExceeded = value;
    }

    /**
     * Gets the value of the spoolShutdownDiscard property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpoolShutdownDiscard() {
        return spoolShutdownDiscard;
    }

    /**
     * Sets the value of the spoolShutdownDiscard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpoolShutdownDiscard(BigInteger value) {
        this.spoolShutdownDiscard = value;
    }

    /**
     * Gets the value of the userProfileDenyGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserProfileDenyGuaranteed() {
        return userProfileDenyGuaranteed;
    }

    /**
     * Sets the value of the userProfileDenyGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserProfileDenyGuaranteed(BigInteger value) {
        this.userProfileDenyGuaranteed = value;
    }

    /**
     * Gets the value of the noLocalDeliveryDiscard property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoLocalDeliveryDiscard() {
        return noLocalDeliveryDiscard;
    }

    /**
     * Sets the value of the noLocalDeliveryDiscard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoLocalDeliveryDiscard(BigInteger value) {
        this.noLocalDeliveryDiscard = value;
    }

    /**
     * Gets the value of the destinationGroupError property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDestinationGroupError() {
        return destinationGroupError;
    }

    /**
     * Sets the value of the destinationGroupError property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDestinationGroupError(BigInteger value) {
        this.destinationGroupError = value;
    }

    /**
     * Gets the value of the lowPriorityMsgCongestionDiscard property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowPriorityMsgCongestionDiscard() {
        return lowPriorityMsgCongestionDiscard;
    }

    /**
     * Sets the value of the lowPriorityMsgCongestionDiscard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowPriorityMsgCongestionDiscard(BigInteger value) {
        this.lowPriorityMsgCongestionDiscard = value;
    }

    /**
     * Gets the value of the totalDeletedMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDeletedMessages() {
        return totalDeletedMessages;
    }

    /**
     * Sets the value of the totalDeletedMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDeletedMessages(BigInteger value) {
        this.totalDeletedMessages = value;
    }

    /**
     * Gets the value of the totalTtlExpiredDiscardMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalTtlExpiredDiscardMessages() {
        return totalTtlExpiredDiscardMessages;
    }

    /**
     * Sets the value of the totalTtlExpiredDiscardMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalTtlExpiredDiscardMessages(BigInteger value) {
        this.totalTtlExpiredDiscardMessages = value;
    }

    /**
     * Gets the value of the totalTtlExpiredToDmqMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalTtlExpiredToDmqMessages() {
        return totalTtlExpiredToDmqMessages;
    }

    /**
     * Sets the value of the totalTtlExpiredToDmqMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalTtlExpiredToDmqMessages(BigInteger value) {
        this.totalTtlExpiredToDmqMessages = value;
    }

    /**
     * Gets the value of the totalTtlExpiredToDmqFailures property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalTtlExpiredToDmqFailures() {
        return totalTtlExpiredToDmqFailures;
    }

    /**
     * Sets the value of the totalTtlExpiredToDmqFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalTtlExpiredToDmqFailures(BigInteger value) {
        this.totalTtlExpiredToDmqFailures = value;
    }

    /**
     * Gets the value of the maxRedeliveryExceededDiscardMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRedeliveryExceededDiscardMessages() {
        return maxRedeliveryExceededDiscardMessages;
    }

    /**
     * Sets the value of the maxRedeliveryExceededDiscardMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRedeliveryExceededDiscardMessages(BigInteger value) {
        this.maxRedeliveryExceededDiscardMessages = value;
    }

    /**
     * Gets the value of the maxRedeliveryExceededToDmqMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRedeliveryExceededToDmqMessages() {
        return maxRedeliveryExceededToDmqMessages;
    }

    /**
     * Sets the value of the maxRedeliveryExceededToDmqMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRedeliveryExceededToDmqMessages(BigInteger value) {
        this.maxRedeliveryExceededToDmqMessages = value;
    }

    /**
     * Gets the value of the maxRedeliveryExceededToDmqFailures property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRedeliveryExceededToDmqFailures() {
        return maxRedeliveryExceededToDmqFailures;
    }

    /**
     * Sets the value of the maxRedeliveryExceededToDmqFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRedeliveryExceededToDmqFailures(BigInteger value) {
        this.maxRedeliveryExceededToDmqFailures = value;
    }

    /**
     * Gets the value of the totalTtlExceededDiscardMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalTtlExceededDiscardMessages() {
        return totalTtlExceededDiscardMessages;
    }

    /**
     * Sets the value of the totalTtlExceededDiscardMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalTtlExceededDiscardMessages(BigInteger value) {
        this.totalTtlExceededDiscardMessages = value;
    }

    /**
     * Gets the value of the totalBytesSpooled property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBytesSpooled() {
        return totalBytesSpooled;
    }

    /**
     * Sets the value of the totalBytesSpooled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBytesSpooled(BigInteger value) {
        this.totalBytesSpooled = value;
    }

    /**
     * Gets the value of the totalMessagesSpooled property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMessagesSpooled() {
        return totalMessagesSpooled;
    }

    /**
     * Sets the value of the totalMessagesSpooled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMessagesSpooled(BigInteger value) {
        this.totalMessagesSpooled = value;
    }

    /**
     * Gets the value of the ingressSelectorStats property.
     * 
     * @return
     *     possible object is
     *     {@link SelectorStatsType }
     *     
     */
    public SelectorStatsType getIngressSelectorStats() {
        return ingressSelectorStats;
    }

    /**
     * Sets the value of the ingressSelectorStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectorStatsType }
     *     
     */
    public void setIngressSelectorStats(SelectorStatsType value) {
        this.ingressSelectorStats = value;
    }

    /**
     * Gets the value of the replicationStats property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationEndptStats }
     *     
     */
    public ReplicationEndptStats getReplicationStats() {
        return replicationStats;
    }

    /**
     * Sets the value of the replicationStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationEndptStats }
     *     
     */
    public void setReplicationStats(ReplicationEndptStats value) {
        this.replicationStats = value;
    }

    /**
     * Gets the value of the egressFlowStats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egressFlowStats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEgressFlowStats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EgressFlowStatsType }
     * 
     * 
     */
    public List<EgressFlowStatsType> getEgressFlowStats() {
        if (egressFlowStats == null) {
            egressFlowStats = new ArrayList<EgressFlowStatsType>();
        }
        return this.egressFlowStats;
    }

    /**
     * Gets the value of the bindStats property.
     * 
     * @return
     *     possible object is
     *     {@link QendptBindStats }
     *     
     */
    public QendptBindStats getBindStats() {
        return bindStats;
    }

    /**
     * Sets the value of the bindStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link QendptBindStats }
     *     
     */
    public void setBindStats(QendptBindStats value) {
        this.bindStats = value;
    }

}