package utils

import scala.slick.driver.PostgresDriver.simple._
import play.api.db.DB
import play.api.db._
import play.api.Play.current

object Connection extends {

  /**
   * Returns Database object
   */
  def databaseObject(): Database = {
    Database.forDataSource(DB.getDataSource())
  }
}
