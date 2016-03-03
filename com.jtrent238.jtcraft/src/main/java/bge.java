/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bge
/*    */   extends bch
/*    */ {
/*    */   private final bfz k;
/* 13 */   private final List l = Lists.newArrayList();
/* 14 */   private final List m = Lists.newArrayList();
/* 15 */   private final bci n = new bga();
/* 16 */   private int o = -1;
/*    */   
/*    */   public bge(bfz parambfz, bao parambao, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 19 */     super(parambao, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 20 */     this.k = parambfz;
/*    */   }
/*    */   
/*    */   public bci b(int paramInt)
/*    */   {
/* 25 */     if (paramInt < this.l.size()) {
/* 26 */       return (bci)this.l.get(paramInt);
/*    */     }
/* 28 */     paramInt -= this.l.size();
/*    */     
/* 30 */     if (paramInt == 0) {
/* 31 */       return this.n;
/*    */     }
/* 33 */     paramInt--;
/*    */     
/* 35 */     return (bci)this.m.get(paramInt);
/*    */   }
/*    */   
/*    */   protected int b()
/*    */   {
/* 40 */     return this.l.size() + 1 + this.m.size();
/*    */   }
/*    */   
/*    */   public void c(int paramInt) {
/* 44 */     this.o = paramInt;
/*    */   }
/*    */   
/*    */   protected boolean a(int paramInt)
/*    */   {
/* 49 */     return paramInt == this.o;
/*    */   }
/*    */   
/*    */   public int k() {
/* 53 */     return this.o;
/*    */   }
/*    */   
/*    */   public void a(bjp parambjp) {
/* 57 */     this.l.clear();
/*    */     
/* 59 */     for (int i = 0; i < parambjp.c(); i++) {
/* 60 */       this.l.add(new bgc(this.k, parambjp.a(i)));
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(List paramList) {
/* 65 */     this.m.clear();
/*    */     
/* 67 */     for (btb localbtb : paramList) {
/* 68 */       this.m.add(new bgb(this.k, localbtb));
/*    */     }
/*    */   }
/*    */   
/*    */   protected int d()
/*    */   {
/* 74 */     return super.d() + 30;
/*    */   }
/*    */   
/*    */   public int c()
/*    */   {
/* 79 */     return super.c() + 85;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */