package models
import org.joda.time.LocalDate

case class Payment(date: LocalDate,
                reference: String,
                amount: BigDecimal)