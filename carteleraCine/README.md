# Cartelera Cine

Proyecto web Api desarrollado en Java con front-end utilizando Spring y base de datos SQL.
 
El proyecto platea ofrecer a los usuarios una página web en la que se puedan logear para poder realizar compra de entradas, productos y reserva de asientos.

## Clases

### Admin (extiende Usuario)

### Butaca
- `idButaca`: Long
- `fila`: Character
- `nroAsiento`: Integer
- `Sala`: Clase Sala

### Cliente (extiende Usuario)
- `Suscripcion`: Clase Suscripcion
- `lCompras`: Lista de Compras
- `puntos`: Integer
- `fechaNacimiento`: LocalDate

### Comestible (extiende Producto)

### Compra
- `idCompra`: Long
- `Usuario`: Clase Usuario
- `fechaHoraCompra`: LocalDateTime
- `lDetalles`: Lista de Detalles
- `total`: Double
- `anulada`: Boolean

### Detalle
- `idDetalle`: Long
- `Producto`: Clase Producto
- `cantidad`: Integer
- `Promocion`: Clase Promocion
- `totalDescuento`: Double
- `Compra`: Clase Compra

### Empleado (extiende Usuario)

### Entrada (extiende Producto)
- `Butaca`: Clase Butaca
- `Funcion`: Clase Funcion

### Establecimiento
- `idEstablecimieto`: Long
- `nombre`: String
- `lSalas`: Lista de Salas
- `direccion`: String

### Funcion
- `idFuncion`: Long
- `Pelicula`: Clase Pelicula
- `fechaHora`: LocalDateTime
- `Sala`: Clase Sala
- `idioma`: Enum (ESPAÑOL, INGLES, ALEMAN, PORTUGUES, JAPONES, MANDARIN)
- `subtitulada`: Enum (NOSUB, SUBESPAÑOL, SUBINGLES, SUBALEMAN, SUBPORTUGUES, SUBJAPONES, SUBMANDARIN)
- `audioDescriptiva`: Boolean
- `estado`: Enum (PROXIMAMENTE, DISPONIBLE, EMITIENDOSE, FINALIZADA, CANCELADA)

### Genero
- `idGenero`: Long
- `nombre`: String

### Merch (extiende Producto)

### Pelicula
- `idPelicula`: Long
- `titulo`: String
- `categoria`: Enum (ATP, +13, +16, +18)
- `lGenero`: Lista de Generos
- `Duracion`: Duration
- `activo`: Boolean

### Producto (Abstracto)
- `idProducto`: Long
- `nombre`: String
- `descripcion`: String
- `precio`: Double
- `activo`: Boolean

### Promocion
- `idPromocion`: Long
- `nombre`: String
- `descripcion`: String
- `fechaHoraVigente`: LocalDateTime
- `tipoPromocion`: Enum (PORCENTUAL, FIJO, CANTIDAD, PUNTOS, SUSCRIPCION, 2X1)
- `valor`: Double

### Sala
- `idSala`: Long
- `lButacas`: Lista de Butacas
- `Establecimiento`: Clase Establecimiento
- `tipo`: Enum (2D, 3D, XD, IMAX, VIP)

### Suscripcion
- `idSuscripcion`: Long
- `nombre`: String
- `descripcion`: String
- `precio`: Double

### Usuario (Abstracto)
- `idUsuario`: Long
- `correo`: String
- `contraseña`: String
- `nombre`: String
- `apellido`: String
- `dni`: String
- `Activo`: Boolean


## /Endpoints [WIP]

### /Butaca
- __getAllButacasFromSala(idSala)__
- __getButacaById(idButaca)__

### /Cliente
- __getAllClientes()__
- __postCliente(postClienteDto)__
- __putCliente(idUsuario, putClienteDto)__

### /Comestible
- __getAllComestible()__
- __getComestibleById(idProducto)__
- __putComestible(idProducto, putComestibleDto)__
- __putBorrarComestible(idProducto)__

### /Compra
- __getAllComprasByUsuario(idUsuario)__
- __postCompra(postCompraDto)__
- __putBajaCompra(idCompra)__

### /Empleado
- __getEmpleadoById(idEmpleado)__
- __postEmpleado(postEmpleadoDto)__
- __putEmpleado(idUsuario, putEmpleadoDto)__

### /Entrada
- __getAllEntradasByFuncion(idFuncion)__
- __postEntrada(postEntradaDto)__
- __putBorrarEntrada(idProducto)__

### /Establecimiento
- __getAllEstablecimientos()__
- __getEstablecimientoById(idEstablecimiento)__


### /Funcion
- __getAllFuncionesDisponiblesByEstablecimiento(idEstablecimiento)__
- __getAllFuncionesDisponiblesByPelicula(idPelicula)__
- __postFuncion(postFuncionDto)__
- __putFuncion(idFuncion, putFuncionDto)__
- __putEstadoFuncion(idFuncion, estado)__

### /Genero
- __getAllGeneros()__

### /Merch
- __getAllMerchActivo()__
- __putMerch(idProducto, putMerchDto)__
- __putBorrarMerch(idProducto)__

### /Pelicula
- __getAllPeliculasActivas()__
- __postPelicula(postPeliculaDto)__
- __putPelicula(putPeliculaDto)__
- __putDesactivarPelicula(idPelicula)__

### /Promocion
- __getAllPromociones()__
- __postPromocion(postPromocionDto)__
- __putPromocion(putPromocionDto)__
- ~~__putBorrarPromocion(idPromocion)__~~

### /Sala
- __getAllSalasByEstablecimiento(idEstablecimiento)__
- __getSalaByEstablecimientoAndPelicula()__

### /Suscripcion

### /Login
- __postLogin(loginDto)__
- __putClave(idUsuario, putClaveDto)__






## DTOs

### Get
- `Admin`
- `Butaca`
- `ButacaEstado`
- `Cliente`
- `Comestible`
- `Compra`
- `Detalle`
- `Empleado`
- `Entrada`
- `Establecimiento`
- `Funcion`
- `Genero`
- `Merch`
- `Pelicula`
- `Promocion`
- `Sala`
- `Suscripcion`

### Post
- `Cliente`
- `Compra`
- `Detalle`
- `Empleado`
- `Entrada`
- `Funcion`
- `Merch`
- `Pelicula`
- `Promocion`

### Put
- `Cliente`
- `Comestible`
- `Empleado`
- `Funcion`
- `Merch`
- `Pelicula`
- `Promocion`

### 