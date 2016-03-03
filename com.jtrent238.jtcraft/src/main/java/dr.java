/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dr
/*    */   extends dz
/*    */ {
/*    */   private long b;
/*    */   
/*    */   dr() {}
/*    */   
/*    */   public dr(long paramLong)
/*    */   {
/* 16 */     this.b = paramLong;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput)
/*    */   {
/* 21 */     paramDataOutput.writeLong(this.b);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput, int paramInt, ds paramds)
/*    */   {
/* 26 */     paramds.a(64L);
/* 27 */     this.b = paramDataInput.readLong();
/*    */   }
/*    */   
/*    */   public byte a()
/*    */   {
/* 32 */     return 4;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 37 */     return "" + this.b + "L";
/*    */   }
/*    */   
/*    */   public dy b()
/*    */   {
/* 42 */     return new dr(this.b);
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 47 */     if (super.equals(paramObject)) {
/* 48 */       dr localdr = (dr)paramObject;
/* 49 */       return this.b == localdr.b;
/*    */     }
/* 51 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode()
/*    */   {
/* 56 */     return super.hashCode() ^ (int)(this.b ^ this.b >>> 32);
/*    */   }
/*    */   
/*    */   public long c()
/*    */   {
/* 61 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d()
/*    */   {
/* 66 */     return (int)(this.b & 0xFFFFFFFFFFFFFFFF);
/*    */   }
/*    */   
/*    */   public short e()
/*    */   {
/* 71 */     return (short)(int)(this.b & 0xFFFF);
/*    */   }
/*    */   
/*    */   public byte f()
/*    */   {
/* 76 */     return (byte)(int)(this.b & 0xFF);
/*    */   }
/*    */   
/*    */   public double g()
/*    */   {
/* 81 */     return this.b;
/*    */   }
/*    */   
/*    */   public float h()
/*    */   {
/* 86 */     return (float)this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */