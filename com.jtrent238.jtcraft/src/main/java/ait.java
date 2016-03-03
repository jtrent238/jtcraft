/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ait
/*    */   extends ain
/*    */ {
/*    */   public ait(int paramInt, ahu paramahu)
/*    */   {
/* 60 */     super(paramInt, paramahu);
/*    */     
/* 62 */     this.ar.x = 2;
/* 63 */     this.ar.y = 2;
/* 64 */     this.ar.z = 5;
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, Random paramRandom, aji[] paramArrayOfaji, byte[] paramArrayOfByte, int paramInt1, int paramInt2, double paramDouble)
/*    */   {
/* 69 */     this.ai = ajn.c;
/* 70 */     this.aj = 0;
/* 71 */     this.ak = ajn.d;
/* 72 */     if (paramDouble > 1.75D) {
/* 73 */       this.ai = ajn.b;
/* 74 */       this.ak = ajn.b;
/* 75 */     } else if (paramDouble > -0.5D) {
/* 76 */       this.ai = ajn.d;
/* 77 */       this.aj = 1;
/*    */     }
/* 79 */     b(paramahb, paramRandom, paramArrayOfaji, paramArrayOfByte, paramInt1, paramInt2, paramDouble);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*    */   {
/* 84 */     this.ar.a(paramahb, paramRandom, this, paramInt1, paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ait.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */