#!/bin/bash

# Para o script parar caso dê algum erro
set -e

# Diretório de saída
OUTPUT_DIR="./docs"

# Cria o diretório caso não exista
mkdir -p "$OUTPUT_DIR"

# Gera a Javadoc
javadoc -encoding UTF-8 -docencoding UTF-8 -charset UTF-8 -d "$OUTPUT_DIR" src/*.java

echo "✅ Documentação gerada em $OUTPUT_DIR"