package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.CancelOrderLimit;
import com.ruoyi.system.service.ICancelOrderLimitService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 撤单限制Controller
 * 
 * @author ruoyi
 * @date 2024-08-28
 */
@RestController
@RequestMapping("/system/cancelOrderLimit")
public class CancelOrderLimitController extends BaseController
{
    @Autowired
    private ICancelOrderLimitService cancelOrderLimitService;

    /**
     * 查询撤单限制列表
     */
    @PreAuthorize("@ss.hasPermi('system:cancelOrderLimit:list')")
    @GetMapping("/list")
    public TableDataInfo list(CancelOrderLimit cancelOrderLimit)
    {
        startPage();
        List<CancelOrderLimit> list = cancelOrderLimitService.selectCancelOrderLimitList(cancelOrderLimit);
        return getDataTable(list);
    }

    /**
     * 导出撤单限制列表
     */
    @PreAuthorize("@ss.hasPermi('system:cancelOrderLimit:export')")
    @Log(title = "撤单限制", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CancelOrderLimit cancelOrderLimit)
    {
        List<CancelOrderLimit> list = cancelOrderLimitService.selectCancelOrderLimitList(cancelOrderLimit);
        ExcelUtil<CancelOrderLimit> util = new ExcelUtil<CancelOrderLimit>(CancelOrderLimit.class);
        util.exportExcel(response, list, "撤单限制数据");
    }

    /**
     * 获取撤单限制详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:cancelOrderLimit:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(cancelOrderLimitService.selectCancelOrderLimitById(id));
    }

    /**
     * 新增撤单限制
     */
    @PreAuthorize("@ss.hasPermi('system:cancelOrderLimit:add')")
    @Log(title = "撤单限制", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CancelOrderLimit cancelOrderLimit)
    {
        return toAjax(cancelOrderLimitService.insertCancelOrderLimit(cancelOrderLimit));
    }

    /**
     * 修改撤单限制
     */
    @PreAuthorize("@ss.hasPermi('system:cancelOrderLimit:edit')")
    @Log(title = "撤单限制", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CancelOrderLimit cancelOrderLimit)
    {
        return toAjax(cancelOrderLimitService.updateCancelOrderLimit(cancelOrderLimit));
    }

    /**
     * 删除撤单限制
     */
    @PreAuthorize("@ss.hasPermi('system:cancelOrderLimit:remove')")
    @Log(title = "撤单限制", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(cancelOrderLimitService.deleteCancelOrderLimitByIds(ids));
    }
}
