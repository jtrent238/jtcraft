/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dw
/*    */   extends dz
/*    */ {
/*    */   private short b;
/*    */   
/*    */   public dw() {}
/*    */   
/*    */   public dw(short paramShort)
/*    */   {
/* 16 */     this.b = paramShort;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput)
/*    */   {
/* 21 */     paramDataOutput.writeShort(this.b);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput, int paramInt, ds paramds)
/*    */   {
/* 26 */     paramds.a(16L);
/* 27 */     this.b = paramDataInput.readShort();
/*    */   }
/*    */   
/*    */   public byte a()
/*    */   {
/* 32 */     return 2;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 37 */     return "" + this.b + "s";
/*    */   }
/*    */   
/*    */   public dy b()
/*    */   {
/* 42 */     return new dw(this.b);
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 47 */     if (super.equals(paramObject)) {
/* 48 */       dw localdw = (dw)paramObject;
/* 49 */       return this.b == localdw.b;
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
/* 71 */     return this.b;
/*    */   }
/*    */   
/*    */   public byte f()
/*    */   {
/* 76 */     return (byte)(this.b & 0xFF);
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


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */