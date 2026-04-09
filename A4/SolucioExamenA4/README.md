# Pokedex Java

## 📋 Descripció

Sistema de gestió de Pokémons amb estructura Model-Vista. Permet capturar, registrar i gestionar Pokémons amb validació d'ID, control de quantitats i diverses operacions CRUD.

## 🏗️ Estructura del Projecte

```
PokedexJava/
├── src/
│   ├── App.java                           # Punt d'entrada del programa
│   ├── Model/
│   │   ├── Pokemon.java                   # Classe que representa un Pokémon
│   │   ├── PokedexModelDAO.java           # Gestió de dades de la Pokedex
│   │   └── IdInvalidException.java        # Excepció personalitzada
│   └── Vista/
│       ├── Menu.java                      # Gestió del menú de consola
│       └── VistaConsola.java              # Interface d'usuari
├── bin/                                   # Fitxers compilats
├── lib/                                   # Llibreries externes (si necessari)
```

## 📌 Funcionalitats

### Menú Principal (7 opcions)

1. **Capturar Pokémon**
   - Demana ID, nom i tipus
   - Validació de ID numèric
   - Detecta si és nou o repetit

2. **Veure Pokedex**
   - Mostra tots els Pokémons únics capturats
   - Comptador total d'espècies

3. **Veure Inventari**
   - Mostra Pokémons amb quantitats
   - Format: `Nom - Tipus - X espècimens`
   - Comptador total

4. **Cambiar tipus Pokémon**
   - Actualitzar el tipus d'una espècie

5. **Alliberar tots els especimens**
   - Elimina completament una espècie

6. **Alliberar un Pokémon**
   - Decrementa la quantitat en 1
   - Elimina si era l'únic

7. **Sortir**
   - Tanca el programa

## 🔒 Validacions

- **ID**: Ha de ser numèric i entre 1-1025
  - Llança `IdInvalidException` si no és vàlid
  - Gestió d'errors numèrics a la vista

- **Nom i Tipus**: Entrada de text lliure
  - Comparació case-insensitive per duplicats

## 📊 Estructura de Dades

### `List<Pokemon>`
- Emmagatzema els Pokémons únics capturats
- Consultes i cerques per nom

### `Map<String, Integer>`
- Clau: Nom del Pokémon (lowercase)
- Valor: Nombre d'exemplars

## 🎯 Criteris de Puntuació (segons enunciat)

- **Model (PokedexModel)**: Dues col·leccions, validacions
- **Capturar Pokémon**: Validació, lògica, col·leccions, feedback
- **Veure Pokedex**: Llistat, comptador
- **Alliberar espècie completa**: Cerca, eliminació, confirmació
- **Cambiar tipus**: Interacció, lògica, feedback
- **Alliberar un Pokémon**: Cerca, decreixement, eliminació
- **Veure Inventari**: Integració, format, comptador
- **Menú**: Gestió, sortida correcta

## 💡 Exemples d'Ús

```
=== Mantenimiento Pokémons ===
1. Capturar Pokémon
2. Veure Pokedex
3. Veure Inventari
4. Cambiar tipus Pokémon
5. Alliberar tots els especimens
6. Alliberar un Pokémon
7. Sortir

Selecciona una opció: 1

--- Capturar Pokémon ---
Introdueix l'ID del Pokémon: 25
Introdueix el nom del Pokémon: Pikachu
Introdueix el tipus del Pokémon: Elèctric
✓ Pokémon Pikachu registrat, és una espècie nova!
```

## 🛠️ Tecnologies

- **Llenguatge**: Java SE
- **Patró**: Model-Vista
- **Col·leccions**: List, Map (HashMap)
- **Excepcions**: Personalitzades (IdInvalidException)

## 📝 Notes

- Es pot executar sense la part de HashMap si cal, però am
b HashMap obté més punts
- Suporta duplicats d'una mateixa espècie
- Comparació de noms insensible a majúscules/minúscules
- Menú a consola amb validació d'entrada

## ✅ Estat

Todo el código está funcional y sigue los requisitos del enunciado.