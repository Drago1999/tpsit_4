/*Inserire in input il numero di processi da creare, generare N processi figlio tramite un ciclo for. Per ogni processo stampare PID del padre e il PID
  del figlio*/


#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

main(){
    int n, x;
    pid_t pid;
    printf("Inserire il numero di processi da creare: ");
    scanf("%d",&n);

    for(x=0;x<n;x++){
        pid=fork();
        if((pid>1)&&(x==0)){
            /*codice del padre che crea i figli*/
            printf("Sono il padre: %d\n",getpid());
        }
        if(pid==0){
          /*Codice del figlio*/
          sleep(1);//fa attendere per 1 secondo i processi figli che risultano tutti orfani, il padre infatti termina prima dei figli
          printf("Sono il figlio: %d, mio padre e': %d\n",getpid(), getppid());
        }
    }
}
~
