> El método add del intArrayList, modifica el array de forma más progresiva,
> conforme se va llenando, simulando un poco ArrayList, podria ser útil cuando los datos no son multiplos de numeros o cuando no se sabe con exactitud el valor que puede llegar a ocupar el array.
> 
> En cambio intVector ofrece escalado doble a partir del tamaño anterior,podría ser más eficiente con datos que sean pares por ejemplo, %==0 creciendo de forma linear.
<p align="center">=========== intArrayList ===========</p>
<p align="center">10</p>
<p align="center">15</p>
<p align="center">22</p>

<p align="center">=========== intVector =============</p>
<p align="center">20</p>
<p align="center">40</p>
<p align="center">80</p>
