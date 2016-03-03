/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class uh
/*    */   extends ui
/*    */ {
/*    */   wf a;
/*    */   wf b;
/*    */   double c;
/*    */   private int d;
/*    */   
/*    */   public uh(wf paramwf, double paramDouble)
/*    */   {
/* 14 */     this.a = paramwf;
/* 15 */     this.c = paramDouble;
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 20 */     if (this.a.d() >= 0) { return false;
/*    */     }
/* 22 */     List localList = this.a.o.a(this.a.getClass(), this.a.C.b(8.0D, 4.0D, 8.0D));
/*    */     
/* 24 */     Object localObject = null;
/* 25 */     double d1 = Double.MAX_VALUE;
/* 26 */     for (wf localwf : localList)
/* 27 */       if (localwf.d() >= 0) {
/* 28 */         double d2 = this.a.f(localwf);
/* 29 */         if (d2 <= d1) {
/* 30 */           d1 = d2;
/* 31 */           localObject = localwf;
/*    */         }
/*    */       }
/* 34 */     if (localObject == null) return false;
/* 35 */     if (d1 < 9.0D) return false;
/* 36 */     this.b = ((wf)localObject);
/* 37 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 42 */     if (!this.b.Z()) return false;
/* 43 */     double d1 = this.a.f(this.b);
/* 44 */     if ((d1 < 9.0D) || (d1 > 256.0D)) return false;
/* 45 */     return true;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 50 */     this.d = 0;
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 55 */     this.b = null;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 60 */     if (--this.d > 0) return;
/* 61 */     this.d = 10;
/* 62 */     this.a.m().a(this.b, this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\uh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */