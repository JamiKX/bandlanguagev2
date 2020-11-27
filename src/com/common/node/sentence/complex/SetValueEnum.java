package com.common.node.sentence.complex;

import com.common.environment.staticMessage.BLObjType;

public enum SetValueEnum {
    STRING{
        @Override
        public BLObjType getType(){
            return BLObjType.RESULT_STRING;
        }
    },
    STMT{
        @Override
        public BLObjType getType(){
            return BLObjType.Node;
        }
    },
    NUMBER{
        @Override
        public BLObjType getType(){
            return BLObjType.RESULT_INTEGER;
        }
    };

     public abstract  BLObjType getType();
}
