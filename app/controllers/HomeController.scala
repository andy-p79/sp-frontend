package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import uk.gov.hmrc.play.bootstrap.controller.FrontendController
import models.Payment
import views.html.Index
import org.joda.time.LocalDate

@Singleton
class HomeController @Inject()(mcc: MessagesControllerComponents,
                               indexView: Index) extends FrontendController(mcc) {

  def index: Action[AnyContent] = Action { implicit request =>
    Ok(indexView(List(
      Payment(new LocalDate(2020,1,1), "abcd1234", 20.00),
      Payment(new LocalDate(2020,1,5), "efgh5678", 50.00)
    )))
  }
}
