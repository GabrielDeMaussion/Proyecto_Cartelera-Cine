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
- `activo`: Enum (PROGRAMADA, EMITIENDOSE, FINALIZADA, CANCELADA)

### Genero
- `idGenero`: Long
- `nombre`: String

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

### Tienda (extiende Producto)

### Usuario (Abstracto)
- `idUsuario`: Long
- `correo`: String
- `contraseña`: String
- `nombre`: String
- `apellido`: String
- `dni`: String


## Métodos