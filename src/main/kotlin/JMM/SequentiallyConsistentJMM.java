package JMM;

/**
 Пример выполнения SequentiallyConsistent программы в JMM
 */
public class SequentiallyConsistentJMM {

    /*
write(x, 1) -> write(y, 1) -> read(y):1 -> read(x):1 // result: (x,y)=(1, 1)
write(x, 1) -> write(y, 1) -> read(x):1 -> read(y):1 // result: (x,y)=(1, 1)
write(x, 1) -> read(y):0 -> write(y, 1) -> read(x):1 // result: (x,y)=(1, 0)

write(y, 1) -> write(x, 1) -> read(x):1 -> read(y):1 // result: (x,y)=(1, 1)
write(y, 1) -> write(x, 1) -> read(y):1 -> read(x):1 // result: (x,y)=(1, 1)
write(y, 1) -> read(x):0 -> write(x, 1) -> read(y):1 // result: (x,y)=(0, 1)
     */


}
