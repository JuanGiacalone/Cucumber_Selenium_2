Feature: Categoria Ejemplo
  Como usuario quiero leer comics

  Scenario Outline:
    Given Existen <tengo> cocas
    When Me tomo <tomo> cocas
    Then Deberian quedar <quedan> cocas

    Examples:
    |tengo|tomo|quedan|
    |5    |3   |2     |
    |10   |5   |5     |
    |2    |2   |0     |

