package org.farhan.adjudication.pharmacy;

public record ClaimResponse(String payProvider, String outOfPocket, String planPays, String rejectMessage) {

}