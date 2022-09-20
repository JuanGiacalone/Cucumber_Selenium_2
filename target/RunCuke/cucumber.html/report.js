$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Categoria Comics",
  "description": "Como usuario quiero entrar al sitio imalittletester e ingresar a los comics para reir",
  "id": "categoria-comics",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5464786401,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Ingresar a la categoria Comics desde Home",
  "description": "",
  "id": "categoria-comics;ingresar-a-la-categoria-comics-desde-home",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "El usuario se encuentra en la pagina Home",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Hace click sobre el boton The little tester comics",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Nos redirige a la pantalla de comics",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.el_usuario_se_encuentra_en_la_pagina_Home_de()"
});
formatter.result({
  "duration": 162346090,
  "status": "passed"
});
formatter.match({
  "location": "Test.hace_click_sobre_el_boton_The_little_tester_comics()"
});
formatter.result({
  "duration": 1251690706,
  "status": "passed"
});
formatter.match({
  "location": "Test.nos_redirige_a_la_pantalla_de_comics()"
});
formatter.result({
  "duration": 45395002,
  "status": "passed"
});
formatter.after({
  "duration": 75808605,
  "status": "passed"
});
});