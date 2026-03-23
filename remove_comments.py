import os
import glob
import re

base_dir = r"c:\Users\Utkarsh\Desktop\LLD_Ass\SST28-LLD101-main"

for filepath in glob.glob(os.path.join(base_dir, "**", "*.java"), recursive=True):
    with open(filepath, "r", encoding="utf-8") as f:
        lines = f.readlines()
    
    new_lines = []
    for line in lines:
        stripped = line.strip()
        if stripped.startswith("//"):
            continue
        new_lines.append(line)
        
    with open(filepath, "w", encoding="utf-8") as f:
        f.writelines(new_lines)

print("Comments removed.")
