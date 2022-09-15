Feature: Categoria Comics
  Como usuario quiero entrar al sitio imalittletester e ingresar a los comics para reir
  Scenario: Ingresar a la categoria Comics desde Home
    Given El usuario se encuentra en la pagina Home
    When Hace click sobre el boton The little tester comics
    Then Nos redirige a la pantalla de comics
