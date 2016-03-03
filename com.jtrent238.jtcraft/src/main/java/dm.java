/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dm
/*    */   extends dz
/*    */ {
/*    */   private float b;
/*    */   
/*    */   dm() {}
/*    */   
/*    */   public dm(float paramFloat)
/*    */   {
/* 17 */     this.b = paramFloat;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput)
/*    */   {
/* 22 */     paramDataOutput.writeFloat(this.b);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput, int paramInt, ds paramds)
/*    */   {
/* 27 */     paramds.a(32L);
/* 28 */     this.b = paramDataInput.readFloat();
/*    */   }
/*    */   
/*    */   public byte a()
/*    */   {
/* 33 */     return 5;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 38 */     return "" + this.b + "f";
/*    */   }
/*    */   
/*    */   public dy b()
/*    */   {
/* 43 */     return new dm(this.b);
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 48 */     if (super.equals(paramObject)) {
/* 49 */       dm localdm = (dm)paramObject;
/* 50 */       return this.b == localdm.b;
/*    */     }
/* 52 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode()
/*    */   {
/* 57 */     return super.hashCode() ^ Float.floatToIntBits(this.b);
/*    */   }
/*    */   
/*    */   public long c()
/*    */   {
/* 62 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d()
/*    */   {
/* 67 */     return qh.d(this.b);
/*    */   }
/*    */   
/*    */   public short e()
/*    */   {
/* 72 */     return (short)(qh.d(this.b) & 0xFFFF);
/*    */   }
/*    */   
/*    */   public byte f()
/*    */   {
/* 77 */     return (byte)(qh.d(this.b) & 0xFF);
/*    */   }
/*    */   
/*    */   public double g()
/*    */   {
/* 82 */     return this.b;
/*    */   }
/*    */   
/*    */   public float h()
/*    */   {
/* 87 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */