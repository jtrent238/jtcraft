/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gd
/*    */   extends ft
/*    */ {
/*    */   private Map a;
/*    */   
/*    */   public gd() {}
/*    */   
/*    */   public gd(Map paramMap)
/*    */   {
/* 21 */     this.a = paramMap;
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 26 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 31 */     int i = paramet.a();
/* 32 */     this.a = Maps.newHashMap();
/*    */     
/* 34 */     for (int j = 0; j < i; j++) {
/* 35 */       ph localph = pp.a(paramet.c(32767));
/* 36 */       int k = paramet.a();
/*    */       
/* 38 */       if (localph != null) this.a.put(localph, Integer.valueOf(k));
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 44 */     paramet.b(this.a.size());
/*    */     
/* 46 */     for (Map.Entry localEntry : this.a.entrySet()) {
/* 47 */       paramet.a(((ph)localEntry.getKey()).e);
/* 48 */       paramet.b(((Integer)localEntry.getValue()).intValue());
/*    */     }
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 54 */     return String.format("count=%d", new Object[] { Integer.valueOf(this.a.size()) });
/*    */   }
/*    */   
/*    */   public Map c() {
/* 58 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */