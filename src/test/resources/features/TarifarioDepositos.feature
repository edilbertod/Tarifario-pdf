#Autor: Edi
  #language: es
Característica: Validacion pdf tarifario de cuentas de depositos
  Como usuario
  Quiero realizar la validaccion del pdf de tarifario de cuentas de depositos
  Para ver si es el pdf correcto

  @caso1
  Escenario: Validacion correcta

    Dado que entro a la seccion de tarifario

    Cuando consulto el pdf

    Entonces verifico que sea el correcto
      |titulo|
      |Tarifario-Depositos.pdf|