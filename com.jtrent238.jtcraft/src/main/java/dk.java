/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dk
/*    */   extends dz
/*    */ {
/*    */   private double b;
/*    */   
/*    */   dk() {}
/*    */   
/*    */   public dk(double paramDouble)
/*    */   {
/* 17 */     this.b = paramDouble;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput)
/*    */   {
/* 22 */     paramDataOutput.writeDouble(this.b);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput, int paramInt, ds paramds)
/*    */   {
/* 27 */     paramds.a(64L);
/* 28 */     this.b = paramDataInput.readDouble();
/*    */   }
/*    */   
/*    */   public byte a()
/*    */   {
/* 33 */     return 6;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 38 */     return "" + this.b + "d";
/*    */   }
/*    */   
/*    */   public dy b()
/*    */   {
/* 43 */     return new dk(this.b);
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 48 */     if (super.equals(paramObject)) {
/* 49 */       dk localdk = (dk)paramObject;
/* 50 */       return this.b == localdk.b;
/*    */     }
/* 52 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode()
/*    */   {
/* 57 */     long l = Double.doubleToLongBits(this.b);
/* 58 */     return super.hashCode() ^ (int)(l ^ l >>> 32);
/*    */   }
/*    */   
/*    */   public long c()
/*    */   {
/* 63 */     return Math.floor(this.b);
/*    */   }
/*    */   
/*    */   public int d()
/*    */   {
/* 68 */     return qh.c(this.b);
/*    */   }
/*    */   
/*    */   public short e()
/*    */   {
/* 73 */     return (short)(qh.c(this.b) & 0xFFFF);
/*    */   }
/*    */   
/*    */   public byte f()
/*    */   {
/* 78 */     return (byte)(qh.c(this.b) & 0xFF);
/*    */   }
/*    */   
/*    */   public double g()
/*    */   {
/* 83 */     return this.b;
/*    */   }
/*    */   
/*    */   public float h()
/*    */   {
/* 88 */     return (float)this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */