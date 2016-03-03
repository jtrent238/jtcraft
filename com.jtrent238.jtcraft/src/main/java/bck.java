/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bck
/*    */   extends bch
/*    */ {
/* 11 */   private final List k = Lists.newArrayList();
/*    */   
/*    */   public bck(bao parambao, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, bbm... paramVarArgs) {
/* 14 */     super(parambao, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 15 */     this.i = false;
/*    */     
/* 17 */     for (int i = 0; i < paramVarArgs.length; i += 2) {
/* 18 */       bbm localbbm1 = paramVarArgs[i];
/* 19 */       bbm localbbm2 = i < paramVarArgs.length - 1 ? paramVarArgs[(i + 1)] : null;
/* 20 */       bcb localbcb1 = a(parambao, paramInt1 / 2 - 155, 0, localbbm1);
/* 21 */       bcb localbcb2 = a(parambao, paramInt1 / 2 - 155 + 160, 0, localbbm2);
/*    */       
/* 23 */       this.k.add(new bcl(localbcb1, localbcb2));
/*    */     }
/*    */   }
/*    */   
/*    */   private bcb a(bao parambao, int paramInt1, int paramInt2, bbm parambbm) {
/* 28 */     if (parambbm == null) return null;
/* 29 */     int i = parambbm.c();
/* 30 */     return parambbm.a() ? new bcn(i, paramInt1, paramInt2, parambbm) : new bcj(i, paramInt1, paramInt2, parambbm, parambao.u.c(parambbm));
/*    */   }
/*    */   
/*    */   public bcl c(int paramInt)
/*    */   {
/* 35 */     return (bcl)this.k.get(paramInt);
/*    */   }
/*    */   
/*    */   protected int b()
/*    */   {
/* 40 */     return this.k.size();
/*    */   }
/*    */   
/*    */   public int c()
/*    */   {
/* 45 */     return 400;
/*    */   }
/*    */   
/*    */   protected int d()
/*    */   {
/* 50 */     return super.d() + 32;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */