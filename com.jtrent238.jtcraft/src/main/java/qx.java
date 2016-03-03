/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qx
/*    */   extends qw
/*    */ {
/*    */   private add b;
/*    */   private int c;
/*    */   private int d;
/*    */   
/*    */   public qx(adb paramadb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 15 */     super(paramInt4);
/* 16 */     this.b = new add(paramadb, 1, paramInt1);
/* 17 */     this.c = paramInt2;
/* 18 */     this.d = paramInt3;
/*    */   }
/*    */   
/*    */   public qx(add paramadd, int paramInt1, int paramInt2, int paramInt3) {
/* 22 */     super(paramInt3);
/* 23 */     this.b = paramadd;
/* 24 */     this.c = paramInt1;
/* 25 */     this.d = paramInt2;
/*    */   }
/*    */   
/*    */   public static void a(Random paramRandom, qx[] paramArrayOfqx, rb paramrb, int paramInt) {
/* 29 */     for (int i = 0; i < paramInt; i++) {
/* 30 */       qx localqx = (qx)qv.a(paramRandom, paramArrayOfqx);
/* 31 */       int j = localqx.c + paramRandom.nextInt(localqx.d - localqx.c + 1);
/*    */       
/* 33 */       if (localqx.b.e() >= j) {
/* 34 */         add localadd1 = localqx.b.m();
/* 35 */         localadd1.b = j;
/* 36 */         paramrb.a(paramRandom.nextInt(paramrb.a()), localadd1);
/*    */       }
/*    */       else {
/* 39 */         for (int k = 0; k < j; k++) {
/* 40 */           add localadd2 = localqx.b.m();
/* 41 */           localadd2.b = 1;
/* 42 */           paramrb.a(paramRandom.nextInt(paramrb.a()), localadd2);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static void a(Random paramRandom, qx[] paramArrayOfqx, apb paramapb, int paramInt) {
/* 49 */     for (int i = 0; i < paramInt; i++) {
/* 50 */       qx localqx = (qx)qv.a(paramRandom, paramArrayOfqx);
/* 51 */       int j = localqx.c + paramRandom.nextInt(localqx.d - localqx.c + 1);
/*    */       
/* 53 */       if (localqx.b.e() >= j) {
/* 54 */         add localadd1 = localqx.b.m();
/* 55 */         localadd1.b = j;
/* 56 */         paramapb.a(paramRandom.nextInt(paramapb.a()), localadd1);
/*    */       }
/*    */       else {
/* 59 */         for (int k = 0; k < j; k++) {
/* 60 */           add localadd2 = localqx.b.m();
/* 61 */           localadd2.b = 1;
/* 62 */           paramapb.a(paramRandom.nextInt(paramapb.a()), localadd2);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static qx[] a(qx[] paramArrayOfqx1, qx... paramVarArgs) {
/* 69 */     qx[] arrayOfqx1 = new qx[paramArrayOfqx1.length + paramVarArgs.length];
/* 70 */     int i = 0;
/*    */     
/* 72 */     for (int j = 0; j < paramArrayOfqx1.length; j++) {
/* 73 */       arrayOfqx1[(i++)] = paramArrayOfqx1[j];
/*    */     }
/*    */     
/* 76 */     for (qx localqx : paramVarArgs) {
/* 77 */       arrayOfqx1[(i++)] = localqx;
/*    */     }
/*    */     
/* 80 */     return arrayOfqx1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */