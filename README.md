# Examen Practico - Ordenamiento y Busqueda de Ligas

## Enunciado

Se tiene una estructura de datos con:

- Una clase `League` (Liga), que contiene un arreglo de `Team` (Equipos).
- Cada `Team` contiene un arreglo de `Player` (Jugadores).
- Cada `Player` tiene un nombre (`String name`), goles anotados (`int goals`) y un indicador de si esta activo (`boolean isActive`).

### Objetivo

Implementar los siguientes requerimientos en el proyecto, teniendo en cuenta la fila asignada.

---

## Requerimientos

### 1. Metodo calculado en League (OBLIGATORIO)

Implementar el metodo `getTotalActiveGoals()` en la clase `League`. Este metodo debe calcular y retornar la suma de goles de todos los jugadores con `isActive = true`, recorriendo todos los equipos de la liga.

Sin este metodo implementado correctamente el resto del examen no funcionara.

```java
public int getTotalActiveGoals() {
    // Implementar aqui
}
```

### 2. Metodo de ordenamiento en LeagueController

Implementar el metodo de ordenamiento correspondiente a su fila, usando como criterio el valor retornado por `getTotalActiveGoals()`.

| Fila | Algoritmo        | Orden       | Nombre exacto del metodo |
|------|------------------|-------------|--------------------------|
| A    | Selection Sort   | Ascendente  | `sortSelectionAsc`       |
| B    | Insertion Sort   | Descendente | `sortInsertionDesc`      |

El metodo debe recibir un arreglo de ligas y retornar el arreglo ordenado.

```java
// Ejemplo firma (Fila A)
public League[] sortSelectionAsc(League[] leagues) {
    // Implementar
}
```

### 3. Metodo de busqueda binaria en LeagueController

Implementar el metodo `binarySearchByTotalActiveGoals`. Este metodo debe realizar una busqueda binaria sobre el arreglo ya ordenado con el metodo de su fila. No recibe parametro de orden; el estudiante debe implementar la logica conforme al ordenamiento que aplico previamente.

Firma exacta requerida:

```java
public League binarySearchByTotalActiveGoals(League[] leagues, int totalActiveGoals) {
    // Fila A: el arreglo viene ordenado ascendentemente
    // Fila B: el arreglo viene ordenado descendentemente
}
```

El metodo debe retornar la liga encontrada o `null` si no existe.

### Tabla de criterios de busqueda por fila

| Fila | Busqueda 1                         | Busqueda 2                    |
|------|------------------------------------|-------------------------------|
| A    | 42 goles activos (existe)          | 55 goles activos (no existe)  |
| B    | 67 goles activos (existe)          | 40 goles activos (no existe)  |

### 4. Salida en consola en App.java (metodo main)

Implementar el metodo `main` de `App.java` para mostrar:

1. Listado original de ligas.
2. Listado ordenado segun su fila.
3. Resultado de la busqueda 1 (indicando si se encontro o no la liga).
4. Resultado de la busqueda 2 (indicando si se encontro o no la liga).

El metodo estatico `App.getLeagues()` ya esta implementado y provee los datos. No modificar ese metodo.

---

## Instrucciones Importantes

### Configuracion Obligatoria

ANTES DE COMENZAR, configure el archivo `student.env` con sus datos:

```
STUDENT_NAME=SU-NOMBRE-COMPLETO
STUDENT_EMAIL=su.email@est.ups.edu.ec
FILA_ESTUDIANTE=A
```

Debe cambiar `FILA_ESTUDIANTE=A` por la letra de su fila asignada (A o B). Si no configura correctamente este archivo, los tests no funcionaran.

### Requisitos del Proyecto

- El proyecto DEBE compilar para poder ser calificado, ya sea de forma parcial o total.
- No modificar: `App.getLeagues()`, `test/LeagueControllerTest.java`, ninguna clase de `lib/`.
- Puede agregar metodos auxiliares privados en `LeagueController` si lo necesita.
- Los nombres de los metodos deben coincidir exactamente con los indicados en este documento.

### Compilacion Manual (para pruebas locales)

```bash
mkdir -p bin
javac -cp "lib/*" -d bin $(find src -name "*.java")
```

Ejecutar tests:

```bash
java -cp "bin:lib/*" org.junit.platform.console.ConsoleLauncher \
  --select-class "test.LeagueControllerTest" \
  --details tree
```

Ejecutar programa principal:

```bash
java -cp "bin:lib/*" App
```

---

## Rubrica de Evaluacion

| Requerimiento                    | Puntos |
|----------------------------------|--------|
| Campo calculado (Test 1)         |   2.6  |
| Metodo de ordenamiento (Test 2)  |   2.6  |
| Busqueda binaria (Test 3)        |   2.6  |
| Salida en consola (main)         |   2    |
| **Total**                        | **10** |

La calificacion se realiza automaticamente al hacer push al repositorio de GitHub.

---

## Estructura del Proyecto

```
src/
  models/
    League.java           <- IMPLEMENTAR: getTotalActiveGoals()
    Team.java             <- No modificar
    Player.java           <- No modificar
  controllers/
    LeagueController.java <- IMPLEMENTAR: metodo de su fila + binarySearch
  test/
    LeagueControllerTest.java <- No modificar
  App.java                <- IMPLEMENTAR: metodo main (getLeagues() ya esta listo)
lib/
  validadores-ligas.jar
  junit-platform-console-standalone-1.7.0.jar
  junit-jupiter-api-5.7.0.jar
student.env               <- CONFIGURAR con sus datos
```

## Folder Structure (VS Code)

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

soy fila b:
este es 