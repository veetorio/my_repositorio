package SistemasdeVoo.ClasseMãe;

import SistemasdeVoo.SistemaLines.Passageiro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public interface SIstemasdeLines
{
    default void reservas(int assento, Passageiro p){}
    default void MostrarPassageiros(){}
}
