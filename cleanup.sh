#!/bin/bash
# Move all .class files from src to out directory
# Usage: ./cleanup.sh

echo "Moving .class files from src to out..."

# Find all .class files in src and move them to out
find src -name "*.class" -type f -exec mv {} out/ \;

echo "Done! All .class files moved to out/"
echo "Total .class files in out:"
ls out/*.class 2>/dev/null | wc -l
