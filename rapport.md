# Rapport

## Tableau des temps en écriture [ms]
|                 | 1B  | 1KiB | 1MiB | 5MiB |
|-----------------|-----|------|------|------|
| BINARY          | 255 | 340  | 1297 | 5256 |
| BUFFERED_BINARY | 393 | 291  | 200  | 297  |
| TEXT            | 286 | 279  | 365  | 636  |
| BUFFERED_TEXT   | 270 | 286  | 321  | 432  |

## Tableau des temps en lecture [ms]
|                 | 1B  | 1KiB | 1MiB | 5MiB |
|-----------------|-----|------|------|------|
| BINARY          | 278 | 266  | 671  | 2238 |
| BUFFERED_BINARY | 260 | 276  | 302  | 446  |
| TEXT            | 262 | 283  | 386  | 630  |
| BUFFERED_TEXT   | 262 | 291  | 320  | 419  |

## Conclusion
Grâce aux mesures effectuées, nous observons que, pour
des petits documents jusqu'à 1KiB, la différence de temps 
d'exécution est négligeable. Mais, à partir de 1MiB, la 
différence de temps est significative. Le cas le plus marquant 
est l'écriture binaire qui devient presque 18 fois plus 
rapide avec l'utilisation d'un buffer.