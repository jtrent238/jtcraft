/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dg
/*    */   extends dz
/*    */ {
/*    */   private byte b;
/*    */   
/*    */   dg() {}
/*    */   
/*    */   public dg(byte paramByte)
/*    */   {
/* 16 */     this.b = paramByte;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput)
/*    */   {
/* 21 */     paramDataOutput.writeByte(this.b);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput, int paramInt, ds paramds)
/*    */   {
/* 26 */     paramds.a(8L);
/* 27 */     this.b = paramDataInput.readByte();
/*    */   }
/*    */   
/*    */   public byte a()
/*    */   {
/* 32 */     return 1;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 37 */     return "" + this.b + "b";
/*    */   }
/*    */   
/*    */   public dy b()
/*    */   {
/* 42 */     return new dg(this.b);
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 47 */     if (super.equals(paramObject)) {
/* 48 */       dg localdg = (dg)paramObject;
/* 49 */       return this.b == localdg.b;
/*    */     }
/* 51 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode()
/*    */   {
/* 56 */     return super.hashCode() ^ this.b;
/*    */   }
/*    */   
/*    */   public long c()
/*    */   {
/* 61 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d()
/*    */   {
/* 66 */     return this.b;
/*    */   }
/*    */   
/*    */   public short e()
/*    */   {
/* 71 */     return (short)this.b;
/*    */   }
/*    */   
/*    */   public byte f()
/*    */   {
/* 76 */     return this.b;
/*    */   }
/*    */   
/*    */   public double g()
/*    */   {
/* 81 */     return this.b;
/*    */   }
/*    */   
/*    */   public float h()
/*    */   {
/* 86 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */