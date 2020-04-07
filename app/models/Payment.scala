package models

case class Payment(date: String,
                reference: String,
                amount: BigDecimal)