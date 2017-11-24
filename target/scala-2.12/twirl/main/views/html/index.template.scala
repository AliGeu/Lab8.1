
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Products")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
 """),format.raw/*4.2*/("""<p class="lead">Product Catalogue</p>
  
<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
    <tr>
    
      <th>ID</th>
      
      <th>Name</th>
      
      <th>Description</th>
      
      <th>Category</th>
      
      <th>Stock</th>
      
      <th>Price</th>
      
    </tr>
  
  </thead>
  
  <tbody>
    """),format.raw/*31.55*/("""
    """),_display_(/*32.6*/for(p<-products) yield /*32.22*/ {_display_(Seq[Any](format.raw/*32.24*/("""
  
  """),format.raw/*34.3*/("""<!-- Product row(s) -->
  
    <tr>
    
      <td>"""),_display_(/*38.12*/p/*38.13*/.getId),format.raw/*38.19*/("""</td>
      
      <td>"""),_display_(/*40.12*/p/*40.13*/.getName),format.raw/*40.21*/("""</td>
      
      <td>"""),_display_(/*42.12*/p/*42.13*/.getDescription),format.raw/*42.28*/("""</td>
      
      <td>"""),_display_(/*44.12*/p/*44.13*/.getStock),format.raw/*44.22*/("""</td>
      
      <td>&euro; """),_display_(/*46.19*/("%.2f".format(p.getPrice))),format.raw/*46.46*/("""</td>
    
    </tr>
  """)))}),format.raw/*49.4*/(""" """),format.raw/*49.22*/("""
  
  """),format.raw/*51.3*/("""</tbody>
  
  </table>
  
  """)))}),format.raw/*55.4*/(""" """))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 17:28:11 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1Lab8CRUD/app/views/index.scala.html
                  HASH: e81242033c3397b73c9da78502a02298078021a0
                  MATRIX: 962->1|1089->33|1117->36|1141->52|1180->54|1208->56|1614->484|1646->490|1678->506|1718->508|1751->514|1830->566|1840->567|1867->573|1918->597|1928->598|1957->606|2008->630|2018->631|2054->646|2105->670|2115->671|2145->680|2203->711|2251->738|2305->762|2334->780|2367->786|2426->815
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|63->31|64->32|64->32|64->32|66->34|70->38|70->38|70->38|72->40|72->40|72->40|74->42|74->42|74->42|76->44|76->44|76->44|78->46|78->46|81->49|81->49|83->51|87->55
                  -- GENERATED --
              */
          