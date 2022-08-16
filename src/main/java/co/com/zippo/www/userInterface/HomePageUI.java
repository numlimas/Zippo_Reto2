package co.com.zippo.www.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageUI {

    public final Target TXT_BUSQUEDA = Target.the("Barra de busqueda del HomePage").
            locatedBy("//input[@id='woocommerce-product-search-field-0']");

    public final Target BTN_BUSQ_PRODUCTO = Target.the("Primer producto de la busqueda realizada").
            locatedBy("(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[1]");

    public final Target LBL_VAL_PRODUCTO = Target.the("Nombre del producto obtenido de la busqueda realizada").
            locatedBy("//h1[@class='product_title entry-title']");

    public final Target LBL_VAL_EXCEL = Target.the("Nombre del producto en pagina").
            locatedBy("nav[@class='woocommerce-breadcrumb']");

    public final Target BTN_CATEGORIA_ENCENDEDORES = Target.the("Boton de Categoria Encendedores").
            locatedBy("(//a[@href='https://zippo.com.co/product-category/encendedores/'])[1]");

    public final Target BTN_SUBCATEGORIA = Target.the("Boton Subcategoria A Prueba de Viento").
            locatedBy("(//a[@href='https://zippo.com.co/product-category/encendedores/a-prueba-de-viento/'])[3]");

    public final Target BTN_PRODUCTO_ALEAT = Target.the("Nombre de producto").
            locatedBy("//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link']");

    public final Target LBL_PRODUCTO_ALEAT = Target.the("Nombre de producto").
            locatedBy("//h2[@class='woocommerce-loop-product__title']");
}
