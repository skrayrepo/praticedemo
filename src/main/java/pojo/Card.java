package pojo;

public class Card {

    private Long cardNumber;
    private String cardName;
    private String cardHolderName;

    public Card(Long cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public Card(Long cardNumber, String cardHolderName, String cardName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", cardHolderName='" + cardHolderName + '\'' +
                '}';
    }
}
