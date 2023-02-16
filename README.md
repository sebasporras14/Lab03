# **PREGUNTAS AERODESCUENTOS**

## **Respuesta #1**
- de acuerdo a las especificaciones se arroja un excepcion cuando:
- Los dias de antelacion sean negativos
- La edad del pasajero sea negativa o mayor a 120(una edad biologicamente invalida)
- la tarifa base sea base sea negativa
 ``` /**
calcular la tarifa de cada billete según el trayecto, la antelación 
en la que se obtiene el billete y la edad del pasajero, de acuerdo 
con la normativa 005.
@param tarifaBase valor base del vuelo
@param diasAntelacion dias de antelación del vuelo
@param edad - edad del pasajero
@throws ExcepcionParametrosInvalidos DIAS_NEGATIVOS
                                     EDAD_INVALIDA
                                     TARIFA_NEGATIVA
**/
public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad)
```

## **Respuesta #2**

| numero | clase de equivalencia | resultado |
| ---      | ---       | ---   |
| 1 | dias positivos | correcto  |
| 2 | dias negativas | incorrecto  |
| 3 | edad entre 0 y 120 | correcto  |
| 4 | edad negativa | incorrecto  |
| 5 | edad mayor a 120 | incorrecto  |
| 6 | tarifa positvia | correcto  |
| 7 | tarifa negativa | incorrecto |
## **Respuesta #3**

| numero | clase de equivalencia | resultado |
| ---      | ---       | ---   |
| 1 | calculoTarifa(150000,3,25) | correcto  |
| 2 | calculoTarifa(155000,-2, 50) | incorrecto  |
| 3 | calculoTarifa(155000,3, 50) | correcto  |
| 4 | calculoTarifa(190000,12, -40) | incorrecto  |
| 5 | calculoTarifa(200000,1, 162) | incorrecto  |
| 6 | calculoTarifa(155000,15, 21) | correcto  |
| 7 | calculoTarifa(-185000,12, 35) | incorrecto |

## **Respuesta #4**


## **Respuesta #5**
