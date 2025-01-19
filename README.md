<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/c/c1/Logo_ULPGC_%282019%29.svg" alt="ULPGC Logo" width="200" />
</p>

# Image Viewer

Este proyecto forma parte de la asignatura **Ingeniería del Software II** de la **Universidad de Las Palmas de Gran Canaria (ULPGC)**. Consiste en una aplicación que permite visualizar una galería de imágenes, con funcionalidades de navegación hacia la siguiente o anterior imagen. 

El código está diseñado siguiendo principios de **Diseño Orientado a Objetos**, patrones de diseño como **Command**, y con arquitecturas de **Model-View-Controller (MVC)** y **Model-View-Presenter (MVP)**. Además, hace uso de **Java Swing** para la interfaz gráfica.

## Estructura del Proyecto

El proyecto se organiza en los siguientes paquetes:

- **Controlador** (`control`): Contiene la lógica de control de comandos ("Next" y "Previous").
- **Modelo** (`model`): Maneja la representación de las imágenes y la carga desde un directorio.
- **Presenter** (`presenter`): Coordina la interacción entre el modelo y la vista para el apartado de **MVP**.
- **Vista** (`view`): Define la interfaz gráfica de usuario.
- **Main** (`main`): Contiene el punto de entrada principal de la aplicación.
- **Viewport** (`utils.viewport`): Ofrece funcionalidades para ajustar el tamaño de las imágenes al contenedor.

## Características

- **Navegación entre imágenes:**
  - Botón "Next" para avanzar a la siguiente imagen.
  - Botón "Previous" para retroceder a la imagen anterior.
- **Ajuste de tamaño:** Las imágenes se redimensionan para ajustarse al tamaño del contenedor utilizando la clase `Viewport`.
- **Galería basada en directorios:** Se cargan imágenes desde una carpeta local con extensiones `.jpg` o `.png`.
- **Interfaz gráfica:** Implementada con `JPanel` y `JFrame` de Java Swing.

## Estructura del Código

1. **Comandos:**
   - `NextImageCommand`: Muestra la siguiente imagen.
   - `PreviousImageCommand`: Muestra la imagen anterior.

2. **Modelo:**
   - `Image`: Representa una imagen con funciones para acceder a la siguiente y la anterior.
   - `FileImageLoader`: Carga las imágenes desde un directorio especificado.

3. **Presentador:**
   - `ImagePresenter`: Gestiona la interacción entre las imágenes y la interfaz.

4. **Vista:**
   - `MainFrame`: Ventana principal de la aplicación.
   - `SwingImageDisplay`: Panel donde se dibujan las imágenes.

5. **Punto de Entrada:**
   - `Main`: Configura el entorno, inicializa los componentes y ejecuta la aplicación.

---
Este proyecto fue desarrollado como parte de los trabajos de la asignatura **Ingeniería del Software II** en la **ULPGC**.

