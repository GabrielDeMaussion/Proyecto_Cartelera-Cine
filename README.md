# Cartelera Cine

Proyecto web Api desarrollado en Java con front-end utilizando Spring y base de datos SQL.
 
El proyecto platea ofrecer a los usuarios una página web en la que se puedan logear para poder realizar compra de entradas, productos y reserva de asientos.

## Clases

### Usuario (Abstracto)
- `idUsuario`: Long
- `nombre`: String
- `apellido`: String
- `dni`: String
- `fechaNacimiento`: LocalDate

### Cliente (extiende Usuario)
- `correo`: String
- `contraseña`: String
- `Suscripcion`: Clase Subscripcion
- `lCompras`: Lista de Compras
- `puntos`: Integer

### Empleado (extiende Usuario)

### Admin (extiende Usuario)

### Producto (Abstracto)
- `idProducto`: Long
- `nombre`: String
- `descripcion`: String
- `precio`: Double

### Butaca
- `idButaca`: Long
- `fila`: Char
- `nroAsiento`: Integer
- `Sala`: Clase Sala

### Sala
- `idSala`: Long
- `lButacas`: Lista de Butacas
- `Establecimiento`: Clase Establecimiento
- `tipo`: Enum (2D, 3D, XD, IMAX, VIP)

### Funcion 
- `idFuncion`: Long
- `Pelicula`: Clase Pelicula
- `fechaHora`: LocalDateTime
- `Sala`: Clase Sala
- `idioma`: Enum (ESPAÑOL, INGLES, ALEMAN, PORTUGUES, JAPONES, MANDARIN)
- `subtitulada`: Enum (NOSUB, SUBESPAÑOL, SUBINGLES, SUBALEMAN, SUBPORTUGUES, SUBJAPONES, SUBMANDARIN)
- `audioDescriptiva`: Boolean
- `activo`: Enum (PROGRAMADA, EMITIENDOSE, FINALIZADA, CANCELADA)

### Entrada (extiende Producto)
- `Butaca`: Clase Butaca
- `Funcion`: Clase Funcion

### Compra
- `idCompra`: Long
- `Usuario`: Clase Usuario
- `fechaCompra`: LocalDateTime
- `lDetalles`: Lista de Detalles
- `total`: Double

### Detalle
- `idDetalle`: Long
- `Producto`: Clase Producto
- `cantidad`: Integer
- `Promocion`: Clase Promocion
- `totalDescuento`: Double
- `Compra`: Clase Compra

### Genero
- `idGenero`: Long
- `nombre`: String

### Pelicula
- `idPelicula`: Long
- `nombre`: String
- `categoria`: Enum (ATP, +13, +16, +18)
- `lGenero`: Lista de Generos
- `Duracion`: Duration
- `activo`: Boolean

### Establecimiento
- `idEstablecimieto`: Long
- `nombre`: String
- `lSalas`: Lista de Salas
- `direccion`: String

## Métodos