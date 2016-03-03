/*    */ import java.util.Collection;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class qv
/*    */ {
/*    */   public static int a(Collection paramCollection)
/*    */   {
/*  8 */     int i = 0;
/*  9 */     for (qw localqw : paramCollection) {
/* 10 */       i += localqw.a;
/*    */     }
/* 12 */     return i;
/*    */   }
/*    */   
/*    */   public static qw a(Random paramRandom, Collection paramCollection, int paramInt) {
/* 16 */     if (paramInt <= 0) {
/* 17 */       throw new IllegalArgumentException();
/*    */     }
/*    */     
/* 20 */     int i = paramRandom.nextInt(paramInt);
/* 21 */     for (qw localqw : paramCollection) {
/* 22 */       i -= localqw.a;
/* 23 */       if (i < 0) {
/* 24 */         return localqw;
/*    */       }
/*    */     }
/* 27 */     return null;
/*    */   }
/*    */   
/*    */   public static qw a(Random paramRandom, Collection paramCollection) {
/* 31 */     return a(paramRandom, paramCollection, a(paramCollection));
/*    */   }
/*    */   
/*    */   public static int a(qw[] paramArrayOfqw) {
/* 35 */     int i = 0;
/* 36 */     for (qw localqw : paramArrayOfqw) {
/* 37 */       i += localqw.a;
/*    */     }
/* 39 */     return i;
/*    */   }
/*    */   
/*    */   public static qw a(Random paramRandom, qw[] paramArrayOfqw, int paramInt)
/*    */   {
/* 44 */     if (paramInt <= 0) {
/* 45 */       throw new IllegalArgumentException();
/*    */     }
/*    */     
/* 48 */     int i = paramRandom.nextInt(paramInt);
/* 49 */     for (qw localqw : paramArrayOfqw) {
/* 50 */       i -= localqw.a;
/* 51 */       if (i < 0) {
/* 52 */         return localqw;
/*    */       }
/*    */     }
/* 55 */     return null;
/*    */   }
/*    */   
/*    */   public static qw a(Random paramRandom, qw[] paramArrayOfqw) {
/* 59 */     return a(paramRandom, paramArrayOfqw, a(paramArrayOfqw));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */