/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pq
/*    */ {
/*  9 */   protected final Map a = Maps.newConcurrentMap();
/*    */   
/*    */   public boolean a(pb parampb) {
/* 12 */     return a(parampb) > 0;
/*    */   }
/*    */   
/*    */   public boolean b(pb parampb) {
/* 16 */     return (parampb.c == null) || (a(parampb.c));
/*    */   }
/*    */   
/*    */   public int c(pb parampb) {
/* 20 */     if (a(parampb)) return 0;
/* 21 */     int i = 0;
/* 22 */     pb localpb = parampb.c;
/*    */     
/* 24 */     while ((localpb != null) && (!a(localpb))) {
/* 25 */       localpb = localpb.c;
/* 26 */       i++;
/*    */     }
/*    */     
/* 29 */     return i;
/*    */   }
/*    */   
/*    */   public void b(yz paramyz, ph paramph, int paramInt) {
/* 33 */     if ((paramph.d()) && (!b((pb)paramph))) return;
/* 34 */     a(paramyz, paramph, a(paramph) + paramInt);
/*    */   }
/*    */   
/*    */   public void a(yz paramyz, ph paramph, int paramInt) {
/* 38 */     pn localpn = (pn)this.a.get(paramph);
/*    */     
/* 40 */     if (localpn == null) {
/* 41 */       localpn = new pn();
/* 42 */       this.a.put(paramph, localpn);
/*    */     }
/*    */     
/* 45 */     localpn.a(paramInt);
/*    */   }
/*    */   
/*    */   public int a(ph paramph) {
/* 49 */     pn localpn = (pn)this.a.get(paramph);
/* 50 */     return localpn == null ? 0 : localpn.a();
/*    */   }
/*    */   
/*    */   public po b(ph paramph) {
/* 54 */     pn localpn = (pn)this.a.get(paramph);
/*    */     
/* 56 */     if (localpn != null) {
/* 57 */       return localpn.b();
/*    */     }
/* 59 */     return null;
/*    */   }
/*    */   
/*    */   public po a(ph paramph, po parampo)
/*    */   {
/* 64 */     pn localpn = (pn)this.a.get(paramph);
/*    */     
/* 66 */     if (localpn == null) {
/* 67 */       localpn = new pn();
/* 68 */       this.a.put(paramph, localpn);
/*    */     }
/*    */     
/* 71 */     localpn.a(parampo);
/*    */     
/* 73 */     return parampo;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\pq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */