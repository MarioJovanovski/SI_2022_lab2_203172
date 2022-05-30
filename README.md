# SI_2022_lab2_203172
# Mario Jovanovski 203172

2. Слика од cfg
 
   ![cfg203172](https://user-images.githubusercontent.com/103331477/171014552-734d39bc-954e-4d6d-8a2a-5a3eee5de7ad.png)


3. Цикломацката комплексност 
   број на јазли е 25, број на конекции е 32, комплексноста е 32-25+2 = 9
   бројот на предикатни јазли е 8(B; F; I.2; J; L; M; P; R;), комплексноста е 8+1 = 9
   
4. Тест случаи според Every Statement критериум
    
[Every_statement.xlsx](https://github.com/MarioJovanovski/SI_2022_lab2_203172/files/8799257/Every_statement.xlsx)

5. Тест случаи според Every Branch критериум
   [Every_branch.xlsx](https://github.com/MarioJovanovski/SI_2022_lab2_203172/files/8799262/Every_branch.xlsx)

6. Објаснување за unit тестови
   
   Постојат 3 тест случаи: 
   - Листата е празна
   - Листата нема квадратна големина
   - Листата има квадратна големина
   Првите 2 тест случаи фрлаат исклучок, па ги споредувам со тие во тестот, а за третиот случај споредувам краен
   резултат на функцијата со очекувана листа.
