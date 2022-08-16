#language: en
Feature: Probar la busqueda de productos

  Scenario Outline: Busqueda de <Producto>
    Given estoy en la pagina Home de Zippo https://www.zippo.com.co
    When escribo <Producto> en la caja de texto de la pagina
    Then valido que obtenga <Producto> requerido

    Examples:
      | Producto    |
      | Calavera    |
      | Dragon      |
      | Estuche     |
      | Aguila      |
      | Combustible |