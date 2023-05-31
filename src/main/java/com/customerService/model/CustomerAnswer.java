package com.customerService.model;

public class CustomerAnswer {
    private Long id;
    private Long questionId;
    private Long customerId;

    public CustomerAnswer(Long id, Long questionId, Long customerId) {
        this.id = id;
        this.questionId = questionId;
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
